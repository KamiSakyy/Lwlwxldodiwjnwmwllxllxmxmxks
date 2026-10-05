package da1;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
final class c extends b0 {
    public c() {
        super("InTableText", 9);
    }

    @Override // da1.b0
    public final boolean d(s0 s0Var, b bVar) {
        if (s0Var.a == 5) {
            k0 k0Var = (k0) s0Var;
            if (k0Var.d.G().equals(b0.P)) {
                bVar.k(this);
                return false;
            }
            bVar.s.add(new k0(k0Var));
            return true;
        }
        if (bVar.s.size() > 0) {
            s0 s0Var2 = bVar.g;
            ArrayList arrayList = bVar.s;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                k0 k0Var2 = (k0) obj;
                bVar.g = k0Var2;
                if (b0.a(k0Var2)) {
                    bVar.t(k0Var2);
                } else {
                    bVar.k(this);
                    boolean c = ba1.h.c(bVar.h().u.t, a0.z);
                    x xVar = b0.x;
                    if (c) {
                        bVar.v = true;
                        xVar.d(k0Var2, bVar);
                        bVar.v = false;
                    } else {
                        xVar.d(k0Var2, bVar);
                    }
                }
            }
            bVar.g = s0Var2;
            bVar.s.clear();
        }
        bVar.l = bVar.m;
        return bVar.H(s0Var);
    }
}
