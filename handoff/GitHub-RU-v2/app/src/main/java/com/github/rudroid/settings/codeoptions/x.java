package com.github.rudroid.settings.codeoptions;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.rudroid.repository.file.RepositoryFileFragment;
import com.github.rudroid.utilities.n;
import ic.qc;
import le.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x extends xa.k {
    /* JADX WARN: Multi-variable type inference failed */
    public final void H(com.github.rudroid.adapters.viewholders.e eVar, zh.b bVar, int i) {
        k71.k.g(bVar, "item");
        qc qcVar = eVar.u;
        k71.k.e(qcVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemNumberedLineBinding");
        qc qcVar2 = qcVar;
        if (bVar instanceof n.b) {
            cd.v vVar = eVar instanceof cd.v ? (cd.v) eVar : null;
            if (vVar != null) {
                if (!((xa.k) this).o) {
                    n.b d = com.github.rudroid.utilities.n.d(qcVar2, this.g, null);
                    N(d.a, d.b);
                }
                vVar.y((n.b) bVar, false, ((xa.k) this).l, ((xa.k) this).m, ((xa.k) this).q, (f) null);
            }
        }
    }

    public final com.github.rudroid.adapters.viewholders.e J(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 1) {
            throw new IllegalStateException("Unknown repo file item type");
        }
        qc b = k5.b.b(from, 2131559227, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new cd.v(b, (RepositoryFileFragment) null, (com.github.rudroid.html.b) null);
    }

    public final boolean O() {
        throw null;
    }
}
