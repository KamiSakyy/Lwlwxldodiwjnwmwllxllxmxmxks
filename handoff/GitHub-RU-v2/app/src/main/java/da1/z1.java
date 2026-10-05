package da1;

/* loaded from: /home/user/work/p/classes5.dex */
final class z1 extends l3 {
    public z1() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        char c;
        aVar.L0();
        aVar.m();
        int i = aVar.u;
        int i2 = aVar.v;
        char[] cArr = aVar.t;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != 0 && c != '&' && c != '\"') {
            i3++;
        }
        aVar.u = i3;
        String r = i3 > i ? a.r(aVar.t, aVar.r, i, i3 - i) : "";
        if (r.length() > 0) {
            u0Var.j.i.g(r);
        } else {
            u0Var.j.j = true;
        }
        int L0 = aVar.L0();
        char t = aVar.t();
        if (t == 0) {
            u0Var.m(this);
            u0Var.j.g((char) 65533, L0, aVar.L0());
            return;
        }
        if (t == '\"') {
            u0Var.o(l3.f0);
            return;
        }
        if (t != '&') {
            if (t != 65535) {
                u0Var.j.g(t, L0, aVar.L0());
                return;
            } else {
                u0Var.l(this);
                u0Var.o(l3.r);
                return;
            }
        }
        int[] c2 = u0Var.c('\"', true);
        if (c2 != null) {
            u0Var.j.h(L0, aVar.L0(), c2);
        } else {
            u0Var.j.g('&', L0, aVar.L0());
        }
    }
}
