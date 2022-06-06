package com.learnjava.example.encapsulation.collection.sorting;

import java.math.BigDecimal;

public final class Comparing {
    private Comparing() {}

    /** Null safe comparison for <code>Numbers</code> as <code>int</code>. */
    public static <T extends Number> int intCompareTo(final T n1, final T n2) {
        return compareTo(n1 != null ? n1.intValue() : null, n2 != null ? n2.intValue() : null);
    }

    /** Null safe comparison for <code>Numbers</code> as <code>long</code>. */
    public static <T extends Number> int longCompareTo(final T n1, final T n2) {
        return compareTo(n1 != null ? n1.longValue() : null, n2 != null ? n2.longValue() : null);
    }

    /** Null safe comparison for <code>Numbers</code> as <code>float</code>. */
    public static <T extends Number> int floatCompareTo(final T n1, final T n2) {
        return compareTo(n1 != null ? n1.floatValue() : null, n2 != null ? n2.floatValue() : null);
    }

    /** Null safe comparison for <code>Numbers</code> as <code>double</code>. */
    public static <T extends Number> int doubleCompareTo(final T n1, final T n2) {
        return compareTo(n1 != null ? n1.doubleValue() : null, n2 != null ? n2.doubleValue() : null);
    }

    /** Null safe comparison for <code>Numbers</code> as <code>BigDecimal</code>. */
    public static <T extends Number> int bigDecimalCompareTo(final T n1, final T n2) {
        return bigDecimalCompareTo(n1 != null ? new BigDecimal(n1.toString()) : null, //
                n2 != null ? new BigDecimal(n2.toString()) : null);
    }

    /** Null safe comparison for <code>BigDecimals</code>. */
    public static <T extends Number> int bigDecimalCompareTo(final BigDecimal n1, final BigDecimal n2) {
        return compareTo(n1, n2);
    }

    /**
     * Null safe comparison for <code>Objects</code> as <code>String</code>. {@link Object#toString()}
     * will be called on each given object.
     */
    public static <T> int stringCompareTo(final T obj1, final T obj2) {
        return stringCompareTo((String) (obj1 != null ? obj1.toString() : null), //
                (String) (obj2 != null ? obj2.toString() : null));
    }

    /** Null safe comparison for two {@link String} values. */
    public static int stringCompareTo(final String str1, final String str2) {
        final boolean f1, f2;
        return (f1 = str1 == null) ^ (f2 = str2 == null) ? f1 ? -1 : 1 : f1 && f2 ? 0 : str1
                .compareToIgnoreCase(str2);
    }

    /**
     * Null safe comparison for <code>Comparables</code>. <br/>
     * <b>Be careful when you place this method inside {@link Comparable#compareTo(Object)} as such a
     * method call will loop.</b>
     **/
    public static <T extends Comparable<T>> int compareTo(final T c1, final T c2) {
//        final boolean f1, f2;
//        return (f1 = c1 == null) ^ (f2 = c2 == null) ? f1 ? -1 : 1 : f1 && f2 ? 0 : c1.compareTo(c2);
        if (c1 == null ^ c2 == null) {
            return (c1 == null) ? -1 : 1;
        }
        if (c1 == null && c2 == null) {
            return 0;
        }
        return c1.compareTo(c2);
    }
}
