package com.github.rudroid.viewmodels;

import android.content.Intent;
import com.github.rudroid.repository.navigation.UsersRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.Avatar;
import gn.n;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class za<T extends gn.n> extends androidx.lifecycle.k1 implements v3 {
    public static final a Companion = new a();
    public UsersRoute s;
    public String t;
    public gn.n u;
    public y71.y1 v;
    public y71.i1 w;
    public x01.i x;

    public static final class a {
        public static void a(Intent intent, gn.n nVar, com.github.domain.users.a aVar, String str) {
            k71.k.g(aVar, "userViewType");
            intent.putExtra("EXTRA_PARAMS", nVar);
            intent.putExtra("EXTRA_VIEW_TYPE", aVar);
            intent.putExtra("EXTRA_SOURCE_ENTITY", str);
        }
    }

    public static final class b implements oe.g {
        public yz0.l4 r;
        public CharSequence s;

        public b(yz0.l4 l4Var, CharSequence charSequence) {
            k71.k.g(charSequence, "htmlText");
            this.r = l4Var;
            this.s = charSequence;
        }

        public final String d() {
            return this.r.c;
        }

        public final Avatar e() {
            return this.r.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.r, bVar.r) && k71.k.b(this.s, bVar.s);
        }

        public final String f() {
            return t71.p.T(this.s) ? "" : this.r.d;
        }

        public final String getName() {
            return this.r.b;
        }

        public final int hashCode() {
            return this.s.hashCode() + (this.r.hashCode() * 31);
        }

        public final String toString() {
            return "ListItemUser(simpleUserOrOrganization=" + this.r + ", htmlText=" + ((Object) this.s) + ")";
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public za(androidx.lifecycle.a1 a1Var) {
        k71.k.g(a1Var, "savedStateHandle");
        UsersRoute usersRoute = (UsersRoute) sy.y.m(a1Var, k71.x.a(UsersRoute.class), ze.e.a);
        this.s = usersRoute;
        this.t = usersRoute.c;
        gn.n nVar = usersRoute.a;
        nVar = nVar == null ? null : nVar;
        if (nVar == null) {
            throw new IllegalStateException("User params needs to be of type ".concat(gn.n.class.getSimpleName()).toString());
        }
        this.u = nVar;
        y71.y1 c = y71.n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.v = c;
        this.w = com.github.rudroid.utilities.w0.f(c, androidx.lifecycle.d1.k(this), new ya(this, 0));
        x01.i.Companion.getClass();
        this.x = x01.i.d;
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new eb(this, null), 3);
    }

    public abstract Object P(gn.n nVar, String str, j71.c cVar, c71.j jVar);

    public final void Q() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new bb(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        return com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) this.v.getValue()) && this.x.a();
    }
}
