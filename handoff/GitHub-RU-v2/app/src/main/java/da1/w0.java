package da1;

import java.util.Locale;

/* loaded from: /home/user/work/p/classes5.dex */
final class w0 extends l3 {
    public w0() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r1 >= r8.u) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    @Override // da1.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(u0 u0Var, a aVar) {
        Object r3 = null;
        if (aVar.w0('/')) {
            u0Var.e();
            u0Var.a(l3.C);
            return;
        }
        if (aVar.z && aVar.E0() && u0Var.o != null) {
            if (u0Var.p == null) {
                u0Var.p = "</" + u0Var.o;
            }
            String str = u0Var.p;
            if (str.equals(aVar.C)) {
                int i = aVar.D;
                if (i == -1) {
                    r3 = false;
                }
                if (!r3) {
                    q0 d = u0Var.d(false);
                    d.j(u0Var.o);
                    u0Var.j = d;
                    u0Var.k();
                    u0Var.o(l3.y);
                    return;
                }
            }
            aVar.C = str;
            Locale locale = Locale.ENGLISH;
            int K0 = aVar.K0(str.toLowerCase(locale));
            if (K0 > -1) {
                aVar.D = aVar.u + K0;
            } else {
                int K02 = aVar.K0(str.toUpperCase(locale));
                r3 = K02 > -1;
                aVar.D = r3 ? aVar.u + K02 : -1;
            }
            if (!r3) {
            }
        }
        u0Var.f('<');
        u0Var.o(l3.t);
    }
}
