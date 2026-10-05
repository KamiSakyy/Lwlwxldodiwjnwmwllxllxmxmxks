package com.github.rudroid.webview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rudroid.interfaces.u0;
import com.github.rudroid.repository.RepositoryDetailFragment;
import com.github.rudroid.utilities.m2;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import com.github.rudroid.webview.viewholders.l;
import ic.ea;
import ic.xg;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import l7.m0;
import l7.n1;
import t71.p;
import zh.c;

/* loaded from: /home/user/work/p/classes3.dex */
public class i extends m0 implements l.a, GitHubWebView.e {
    public final j d;
    public final u0 e;
    public RecyclerView f;
    public final ArrayList g;
    public final m2 h;
    public final zh.a i;

    public i(Context context, RepositoryDetailFragment repositoryDetailFragment, u0 u0Var, int i) {
        repositoryDetailFragment = (i & 2) != 0 ? null : repositoryDetailFragment;
        u0Var = (i & 4) != 0 ? null : u0Var;
        this.d = repositoryDetailFragment;
        this.e = u0Var;
        this.g = new ArrayList();
        this.h = new m2();
        this.i = new zh.a(context);
        super.D(true);
    }

    public final void D(boolean z) {
        throw null;
    }

    public final Integer F(String str) {
        k.g(str, "id");
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            zh.b bVar = (zh.b) obj;
            zh.f fVar = bVar instanceof zh.f ? (zh.f) bVar : null;
            if (k.b(fVar != null ? fVar.a() : null, str)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final void G(int i, j71.c cVar) {
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            k.m("attachedRecyclerView");
            throw null;
        }
        n1 K = recyclerView.K(i);
        GitHubWebView.g gVar = K instanceof GitHubWebView.g ? (GitHubWebView.g) K : null;
        if (gVar == null) {
            cVar.k("");
            return;
        }
        GitHubWebView e = gVar.e();
        final a0.n1 n1Var = new a0.n1(18, cVar);
        e.evaluateJavascript("window.getSelection().toString()", new ValueCallback() { // from class: com.github.rudroid.webview.viewholders.d
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String str = (String) obj;
                GitHubWebView.b bVar = GitHubWebView.Companion;
                k71.k.d(str);
                n1Var.k(p.u0(str, new char[]{'\"'}));
            }
        });
    }

    public void H(com.github.rudroid.adapters.viewholders.e eVar, zh.b bVar, int i) {
        k.g(bVar, "item");
    }

    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void v(com.github.rudroid.adapters.viewholders.e eVar, int i) {
        zh.b bVar = (zh.b) this.g.get(i);
        if (bVar instanceof c.C0033c) {
            ((l) eVar).y((zh.g) bVar);
        } else if (bVar instanceof c.b) {
            ((com.github.rudroid.webview.viewholders.b) eVar).y((c.b) bVar);
        } else {
            H(eVar, bVar, i);
        }
    }

    public com.github.rudroid.adapters.viewholders.e J(ViewGroup viewGroup, int i) {
        throw new IllegalStateException(no.a.k("Unimplemented view type: ", i));
    }

    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public com.github.rudroid.adapters.viewholders.e w(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        k.f(from, "from(...)");
        if (i == 0) {
            xg b = k5.b.b(from, 2131559284, viewGroup, false, k5.b.b);
            k.f(b, "inflate(...)");
            return new l(b, this, this.e);
        }
        if (i == 1) {
            ea b2 = k5.b.b(from, 2131559195, viewGroup, false, k5.b.b);
            k.f(b2, "inflate(...)");
            return new com.github.rudroid.webview.viewholders.b(b2);
        }
        zh.c.Companion.getClass();
        int i2 = zh.c.t;
        if (i >= i2) {
            i -= i2;
        }
        return J(viewGroup, i);
    }

    public final void L(List list) {
        ArrayList arrayList = this.g;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        n();
    }

    public final void M(List list) {
        k.g(list, "data");
        L(h.a(list));
    }

    public final List getData() {
        return this.g;
    }

    public final int k() {
        return this.g.size();
    }

    public long l(int i) {
        return this.h.a(((zh.b) this.g.get(i)).E());
    }

    public final int m(int i) {
        ArrayList arrayList = this.g;
        boolean z = arrayList.get(i) instanceof zh.c;
        int h = ((zh.b) arrayList.get(i)).h();
        if (z) {
            return h;
        }
        zh.c.Companion.getClass();
        return h + zh.c.t;
    }

    public void u(RecyclerView recyclerView) {
        recyclerView.H.add(this.i);
        this.f = recyclerView;
    }

    public void x(RecyclerView recyclerView) {
        ArrayList arrayList = recyclerView.H;
        zh.a aVar = this.i;
        arrayList.remove(aVar);
        if (recyclerView.I == aVar) {
            recyclerView.I = null;
        }
    }




}
