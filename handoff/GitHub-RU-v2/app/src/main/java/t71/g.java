package t71;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f32121b = new g();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32122a = true;

    public g() {
        if (sy.s.b("")) {
            return;
        }
        sy.s.b("");
    }

    public final void a(String str, StringBuilder sb2) {
        f1.e.x(sb2, str, "prefix = \"", "", "\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("suffix = \"");
        sb2.append("");
        sb2.append("\",");
        sb2.append('\n');
        sb2.append(str);
        sb2.append("removeLeadingZeros = ");
        sb2.append(false);
        sb2.append(',');
        sb2.append('\n');
        sb2.append(str);
        sb2.append("minLength = ");
        sb2.append(1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NumberHexFormat(\n");
        a("    ", sb2);
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }

    public g(Object... a) {
    }
}
