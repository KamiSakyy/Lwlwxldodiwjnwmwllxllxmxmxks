package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 {
    public static final r6 t;
    public static final r6 u;
    public static final /* synthetic */ r6[] v;
    public s6 r;
    public int s;

    /* JADX INFO: Fake field, exist only in values array */
    r6 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    r6 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    r6 EF0;

    static {
        r6 r6Var = new r6("DOUBLE", 0, s6.u, 1);
        r6 r6Var2 = new r6("FLOAT", 1, s6.t, 5);
        s6 s6Var = s6.s;
        r6 r6Var3 = new r6("INT64", 2, s6Var, 0);
        r6 r6Var4 = new r6("UINT64", 3, s6Var, 0);
        s6 s6Var2 = s6.r;
        r6 r6Var5 = new r6("INT32", 4, s6Var2, 0);
        r6 r6Var6 = new r6("FIXED64", 5, s6Var, 1);
        r6 r6Var7 = new r6("FIXED32", 6, s6Var2, 5);
        r6 r6Var8 = new r6("BOOL", 7, s6.v, 0);
        r6 r6Var9 = new r6("STRING", 8, s6.w, 2);
        t = r6Var9;
        s6 s6Var3 = s6.z;
        r6 r6Var10 = new r6("GROUP", 9, s6Var3, 3);
        u = r6Var10;
        v = new r6[]{r6Var, r6Var2, r6Var3, r6Var4, r6Var5, r6Var6, r6Var7, r6Var8, r6Var9, r6Var10, new r6("MESSAGE", 10, s6Var3, 2), new r6("BYTES", 11, s6.x, 2), new r6("UINT32", 12, s6Var2, 0), new r6("ENUM", 13, s6.y, 0), new r6("SFIXED32", 14, s6Var2, 5), new r6("SFIXED64", 15, s6Var, 1), new r6("SINT32", 16, s6Var2, 0), new r6("SINT64", 17, s6Var, 0)};
    }

    public r6(String str, int i, s6 s6Var, int i2) {
        this.r = s6Var;
        this.s = i2;
    }

    public static r6[] values() {
        return (r6[]) v.clone();
    }
    public Object ordinal() { return null; }
}
