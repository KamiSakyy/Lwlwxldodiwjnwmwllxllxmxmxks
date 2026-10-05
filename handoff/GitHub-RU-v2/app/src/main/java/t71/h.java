package t71;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f32123d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32124a;

    /* renamed from: b, reason: collision with root package name */
    public final f f32125b;

    /* renamed from: c, reason: collision with root package name */
    public final g f32126c;

    static {
        f fVar = f.f32120a;
        g gVar = g.f32121b;
        f32123d = new h(false, fVar, gVar);
        new h(true, fVar, gVar);
    }

    public h(boolean z10, f fVar, g gVar) {
        k71.k.g(fVar, "bytes");
        k71.k.g(gVar, "number");
        this.f32124a = z10;
        this.f32125b = fVar;
        this.f32126c = gVar;
    }

    public final String toString() {
        StringBuilder p3 = f1.e.p("HexFormat(\n    upperCase = ");
        p3.append(this.f32124a);
        p3.append(",\n    bytes = BytesHexFormat(\n");
        this.f32125b.a("        ", p3);
        p3.append('\n');
        p3.append("    ),");
        p3.append('\n');
        p3.append("    number = NumberHexFormat(");
        p3.append('\n');
        this.f32126c.a("        ", p3);
        p3.append('\n');
        p3.append("    )");
        p3.append('\n');
        p3.append(")");
        return p3.toString();
    }



}
