package dh;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final b r;
    public static final /* synthetic */ b[] s;

    static {
        b bVar = new b("Picker", 0);
        r = bVar;
        b[] bVarArr = {bVar, new b("Input", 1)};
        s = bVarArr;
        l0.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) s.clone();
    }
    public static Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object ordinal() { return null; }
}
