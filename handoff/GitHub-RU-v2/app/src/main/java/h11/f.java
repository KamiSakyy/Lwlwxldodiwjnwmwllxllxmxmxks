package h11;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cd.w;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.google.android.material.switchmaterial.SwitchMaterial;
import f0.o0;
import l7.m0;
import l7.n1;
import y41.t1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends m0 {
    public final /* synthetic */ int d;
    public final d71.b e;
    public final k71.i f;

    public f(o0 o0Var, byte b) {
        this.d = 1;
        this.f = o0Var;
        this.e = ei.c.e0;
    }

    public final int k() {
        switch (this.d) {
        }
        return this.e.a();
    }

    public final void v(n1 n1Var, int i) {
        int i2 = this.d;
        d71.b bVar = this.e;
        switch (i2) {
            case 0:
                e eVar = (e) n1Var;
                ei.g gVar = (ei.g) bVar.get(i);
                eVar.u.setText(gVar.s);
                SwitchMaterial switchMaterial = eVar.v;
                ei.f fVar = t1.b;
                if (fVar != null) {
                    fVar.a(gVar);
                } else {
                    ei.d dVar = ei.d.s;
                }
                switchMaterial.setChecked(false);
                ((n1) eVar).a.setOnClickListener(new w(this, gVar, eVar, 2));
                break;
            default:
                ii.c cVar = (ii.c) n1Var;
                ei.c cVar2 = (ei.c) bVar.get(i);
                cVar.u.setText(cVar2.s);
                cVar.v.setText(cVar2.u);
                SwitchMaterial switchMaterial2 = cVar.w;
                RuntimeFeatureFlag.a.getClass();
                switchMaterial2.setChecked(RuntimeFeatureFlag.a(cVar2));
                ((n1) cVar).a.setOnClickListener(new w(this, cVar2, cVar, 3));
                break;
        }
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131559145, viewGroup, false);
                k71.k.d(inflate);
                return new e(inflate);
            default:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131559145, viewGroup, false);
                k71.k.d(inflate2);
                return new ii.c(inflate2);
        }
    }

    public f(o0 o0Var) {
        this.d = 0;
        this.f = o0Var;
        this.e = ei.g.J;
    }

}
