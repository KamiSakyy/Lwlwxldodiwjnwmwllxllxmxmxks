package e21;

import b1.m;
import b21.q;
import b21.t;
import c21.j;
import c21.l;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.measurement.internal.x3;
import w21.g;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends a21.c {
    public static final m i = new m(new b(), new j(1));

    public final o a(l lVar) {
        y51.c cVar = new y51.c(13);
        z11.d[] dVarArr = {m21.b.a};
        cVar.s = new x3(7, lVar);
        h4 h4Var = new h4();
        h4Var.c = cVar;
        h4Var.b = dVarArr;
        h4Var.a = false;
        g gVar = new g();
        b21.d dVar = this.h;
        dVar.getClass();
        q qVar = new q(new t(h4Var, gVar, this.g), dVar.z.get(), this);
        h0 h0Var = dVar.D;
        h0Var.sendMessage(h0Var.obtainMessage(4, qVar));
        return gVar.a;
    }

}
