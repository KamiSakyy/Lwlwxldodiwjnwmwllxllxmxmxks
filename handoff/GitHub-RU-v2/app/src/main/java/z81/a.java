package z81;

import w50.m;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a {
    public static final m a = new m(9);

    public static final int a(String str, int i) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }
}
