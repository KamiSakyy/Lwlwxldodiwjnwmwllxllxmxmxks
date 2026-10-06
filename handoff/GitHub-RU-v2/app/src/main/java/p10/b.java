package p10;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public static final a Companion;
    public static final /* synthetic */ b[] t;
    public String r;
    public int s;

    static {
        b[] bVarArr = {new b(0, 6, "DAY", "d"), new b(1, 3, "WEEK", "w"), new b(2, 2, "MONTH", "m"), new b(3, 1, "YEAR", "y")};
        t = bVarArr;
        l0.t(bVarArr);
        Companion = new a();
    }

    public b(int i, int i2, String str, String str2) {
        this.r = str2;
        this.s = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) t.clone();
    }
}
