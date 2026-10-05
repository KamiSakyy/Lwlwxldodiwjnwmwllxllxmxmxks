package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /home/user/work/p/classes.dex */
public class n1 {

    /* renamed from: t, reason: collision with root package name */
    public static final j1 f2341t;

    /* renamed from: u, reason: collision with root package name */
    public static final k1 f2342u;

    /* renamed from: v, reason: collision with root package name */
    public static final l1 f2343v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ n1[] f2344w;

    /* renamed from: r, reason: collision with root package name */
    public final o1 f2345r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2346s;

    /* JADX INFO: Fake field, exist only in values array */
    n1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    n1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    n1 EF2;

    static {
        n1 n1Var = new n1("DOUBLE", 0, o1.f2352u, 1);
        n1 n1Var2 = new n1("FLOAT", 1, o1.f2351t, 5);
        o1 o1Var = o1.f2350s;
        n1 n1Var3 = new n1("INT64", 2, o1Var, 0);
        n1 n1Var4 = new n1("UINT64", 3, o1Var, 0);
        o1 o1Var2 = o1.f2349r;
        n1 n1Var5 = new n1("INT32", 4, o1Var2, 0);
        n1 n1Var6 = new n1("FIXED64", 5, o1Var, 1);
        n1 n1Var7 = new n1("FIXED32", 6, o1Var2, 5);
        n1 n1Var8 = new n1("BOOL", 7, o1.f2353v, 0);
        j1 j1Var = new j1("STRING", 8, o1.f2354w, 2);
        f2341t = j1Var;
        o1 o1Var3 = o1.f2357z;
        k1 k1Var = new k1("GROUP", 9, o1Var3, 3);
        f2342u = k1Var;
        l1 l1Var = new l1("MESSAGE", 10, o1Var3, 2);
        f2343v = l1Var;
        f2344w = new n1[]{n1Var, n1Var2, n1Var3, n1Var4, n1Var5, n1Var6, n1Var7, n1Var8, j1Var, k1Var, l1Var, new m1("BYTES", 11, o1.f2355x, 2), new n1("UINT32", 12, o1Var2, 0), new n1("ENUM", 13, o1.f2356y, 0), new n1("SFIXED32", 14, o1Var2, 5), new n1("SFIXED64", 15, o1Var, 1), new n1("SINT32", 16, o1Var2, 0), new n1("SINT64", 17, o1Var, 0)};
    }

    public n1(String str, int i, o1 o1Var, int i10) {
        this.f2345r = o1Var;
        this.f2346s = i10;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) f2344w.clone();
    }
}
