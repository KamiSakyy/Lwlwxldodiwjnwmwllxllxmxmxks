package com.github.rudroid.support;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.rudroid.support.b;
import com.github.rudroid.utilities.b;
import com.github.rudroid.utilities.m2;
import com.google.android.material.imageview.ShapeableImageView;
import ic.oe;
import ic.qe;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import l7.m0;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends m0 {
    public SupportFragment d;
    public SupportFragment e;
    public final m2 f = new m2();
    public final ArrayList g = new ArrayList();

    public e(SupportFragment supportFragment, SupportFragment supportFragment2) {
        this.d = supportFragment;
        this.e = supportFragment2;
        D(true);
    }

    public final int k() {
        return this.g.size();
    }

    public final long l(int i) {
        String str = ((b) this.g.get(i)).a;
        if (str == null) {
            str = "";
        }
        return this.f.a(str);
    }

    public final int m(int i) {
        return ((b) this.g.get(i)).b;
    }

    public final void v(n1 n1Var, int i) {
        com.github.rudroid.adapters.viewholders.e eVar = (com.github.rudroid.adapters.viewholders.e) n1Var;
        b bVar = (b) this.g.get(i);
        if (bVar instanceof b.c) {
            final d dVar = eVar instanceof d ? (d) eVar : null;
            if (dVar != null) {
                final b.c cVar = (b.c) bVar;
                qe qeVar = ((com.github.rudroid.adapters.viewholders.e) dVar).u;
                if (qeVar instanceof qe) {
                    qe qeVar2 = qeVar;
                    ShapeableImageView shapeableImageView = qeVar2.P;
                    shapeableImageView.setImageURI(cVar.c);
                    final int i2 = 0;
                    shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.github.rudroid.support.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    dVar.v.h0(cVar.c);
                                    break;
                                default:
                                    dVar.v.h0(cVar.c);
                                    break;
                            }
                        }
                    });
                    com.github.rudroid.utilities.b.Companion.getClass();
                    b.a.c(shapeableImageView, 2131954063);
                    final int i3 = 1;
                    qeVar2.O.setOnClickListener(new View.OnClickListener() { // from class: com.github.rudroid.support.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i3) {
                                case 0:
                                    dVar.v.h0(cVar.c);
                                    break;
                                default:
                                    dVar.v.h0(cVar.c);
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (!(bVar instanceof b.C0008b)) {
            throw new NoWhenBranchMatchedException();
        }
        eVar.u.F0();
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        if (i == 0) {
            oe b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559254, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            return new a(b, this.d);
        }
        if (i != 1) {
            throw new IllegalStateException();
        }
        qe b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559255, viewGroup, false, k5.b.b);
        k71.k.f(b2, "inflate(...)");
        return new d(b2, this.e);
    }
    public Object n() { return null; }
    public Object u = null;
    public Object D(boolean p1) { return null; }
}
