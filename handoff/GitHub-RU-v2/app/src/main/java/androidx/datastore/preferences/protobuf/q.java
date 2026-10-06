package androidx.datastore.preferences.protobuf;

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
/* loaded from: /home/user/work/p/classes.dex */
public final class q {

    /* renamed from: s, reason: collision with root package name */
    public static final q f2361s;

    /* renamed from: t, reason: collision with root package name */
    public static final q f2362t;

    /* renamed from: u, reason: collision with root package name */
    public static final q[] f2363u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ q[] f2364v;

    /* renamed from: r, reason: collision with root package name */
    public final int f2365r;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    static {
        x xVar = x.f2398v;
        q qVar = new q("DOUBLE", 0, 0, 1, xVar);
        x xVar2 = x.f2397u;
        q qVar2 = new q("FLOAT", 1, 1, 1, xVar2);
        x xVar3 = x.f2396t;
        q qVar3 = new q("INT64", 2, 2, 1, xVar3);
        q qVar4 = new q("UINT64", 3, 3, 1, xVar3);
        x xVar4 = x.f2395s;
        q qVar5 = new q("INT32", 4, 4, 1, xVar4);
        q qVar6 = new q("FIXED64", 5, 5, 1, xVar3);
        q qVar7 = new q("FIXED32", 6, 6, 1, xVar4);
        x xVar5 = x.f2399w;
        q qVar8 = new q("BOOL", 7, 7, 1, xVar5);
        x xVar6 = x.f2400x;
        q qVar9 = new q("STRING", 8, 8, 1, xVar6);
        x xVar7 = x.A;
        q qVar10 = new q("MESSAGE", 9, 9, 1, xVar7);
        x xVar8 = x.f2401y;
        q qVar11 = new q("BYTES", 10, 10, 1, xVar8);
        q qVar12 = new q("UINT32", 11, 11, 1, xVar4);
        x xVar9 = x.f2402z;
        q qVar13 = new q("ENUM", 12, 12, 1, xVar9);
        q qVar14 = new q("SFIXED32", 13, 13, 1, xVar4);
        q qVar15 = new q("SFIXED64", 14, 14, 1, xVar3);
        q qVar16 = new q("SINT32", 15, 15, 1, xVar4);
        q qVar17 = new q("SINT64", 16, 16, 1, xVar3);
        q qVar18 = new q("GROUP", 17, 17, 1, xVar7);
        q qVar19 = new q("DOUBLE_LIST", 18, 18, 2, xVar);
        q qVar20 = new q("FLOAT_LIST", 19, 19, 2, xVar2);
        q qVar21 = new q("INT64_LIST", 20, 20, 2, xVar3);
        q qVar22 = new q("UINT64_LIST", 21, 21, 2, xVar3);
        q qVar23 = new q("INT32_LIST", 22, 22, 2, xVar4);
        q qVar24 = new q("FIXED64_LIST", 23, 23, 2, xVar3);
        q qVar25 = new q("FIXED32_LIST", 24, 24, 2, xVar4);
        q qVar26 = new q("BOOL_LIST", 25, 25, 2, xVar5);
        q qVar27 = new q("STRING_LIST", 26, 26, 2, xVar6);
        q qVar28 = new q("MESSAGE_LIST", 27, 27, 2, xVar7);
        q qVar29 = new q("BYTES_LIST", 28, 28, 2, xVar8);
        q qVar30 = new q("UINT32_LIST", 29, 29, 2, xVar4);
        q qVar31 = new q("ENUM_LIST", 30, 30, 2, xVar9);
        q qVar32 = new q("SFIXED32_LIST", 31, 31, 2, xVar4);
        q qVar33 = new q("SFIXED64_LIST", 32, 32, 2, xVar3);
        q qVar34 = new q("SINT32_LIST", 33, 33, 2, xVar4);
        q qVar35 = new q("SINT64_LIST", 34, 34, 2, xVar3);
        q qVar36 = new q("DOUBLE_LIST_PACKED", 35, 35, 3, xVar);
        f2361s = qVar36;
        q qVar37 = new q("FLOAT_LIST_PACKED", 36, 36, 3, xVar2);
        q qVar38 = new q("INT64_LIST_PACKED", 37, 37, 3, xVar3);
        q qVar39 = new q("UINT64_LIST_PACKED", 38, 38, 3, xVar3);
        q qVar40 = new q("INT32_LIST_PACKED", 39, 39, 3, xVar4);
        q qVar41 = new q("FIXED64_LIST_PACKED", 40, 40, 3, xVar3);
        q qVar42 = new q("FIXED32_LIST_PACKED", 41, 41, 3, xVar4);
        q qVar43 = new q("BOOL_LIST_PACKED", 42, 42, 3, xVar5);
        q qVar44 = new q("UINT32_LIST_PACKED", 43, 43, 3, xVar4);
        q qVar45 = new q("ENUM_LIST_PACKED", 44, 44, 3, xVar9);
        q qVar46 = new q("SFIXED32_LIST_PACKED", 45, 45, 3, xVar4);
        q qVar47 = new q("SFIXED64_LIST_PACKED", 46, 46, 3, xVar3);
        q qVar48 = new q("SINT32_LIST_PACKED", 47, 47, 3, xVar4);
        q qVar49 = new q("SINT64_LIST_PACKED", 48, 48, 3, xVar3);
        f2362t = qVar49;
        f2364v = new q[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, qVar15, qVar16, qVar17, qVar18, qVar19, qVar20, qVar21, qVar22, qVar23, qVar24, qVar25, qVar26, qVar27, qVar28, qVar29, qVar30, qVar31, qVar32, qVar33, qVar34, qVar35, qVar36, qVar37, qVar38, qVar39, qVar40, qVar41, qVar42, qVar43, qVar44, qVar45, qVar46, qVar47, qVar48, qVar49, new q("GROUP_LIST", 49, 49, 2, xVar7), new q("MAP", 50, 50, 4, x.f2394r)};
        q[] values = values();
        f2363u = new q[values.length];
        for (q qVar50 : values) {
            f2363u[qVar50.f2365r] = qVar50;
        }
    }

    public q(String str, int i, int i10, int i11, x xVar) {
        this.f2365r = i10;
        int b10 = y3.a.b(i11);
        if (b10 == 1) {
            xVar.getClass();
        } else if (b10 == 3) {
            xVar.getClass();
        }
        if (i11 == 1) {
            xVar.ordinal();
        }
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f2364v.clone();
    }
}
