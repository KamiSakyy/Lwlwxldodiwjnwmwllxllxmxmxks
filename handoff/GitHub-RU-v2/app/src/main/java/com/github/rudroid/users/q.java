package com.github.rudroid.users;

import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import androidx.lifecycle.r1;
import androidx.lifecycle.s1;
import com.github.domain.users.UserViewType$Contributors;
import com.github.domain.users.UserViewType$Followers;
import com.github.domain.users.UserViewType$Following;
import com.github.domain.users.UserViewType$Reactees;
import com.github.domain.users.UserViewType$ReleaseMentions;
import com.github.domain.users.UserViewType$Sponsoring;
import com.github.domain.users.UserViewType$Stargazers;
import com.github.domain.users.UserViewType$Watchers;
import com.github.rudroid.viewmodels.fb;
import com.github.rudroid.viewmodels.r6;
import com.github.rudroid.viewmodels.s6;
import com.github.rudroid.viewmodels.v0;
import com.github.rudroid.viewmodels.w0;
import com.github.rudroid.viewmodels.w7;
import com.github.rudroid.viewmodels.x7;
import com.github.rudroid.viewmodels.za;
import kotlin.NoWhenBranchMatchedException;
import l7.x1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q extends r1 implements o1 {
    public final x1 a;
    public final s0 b;
    public final Bundle c;
    public final /* synthetic */ com.github.domain.users.a d;
    public final /* synthetic */ r e;

    public q(s7.d dVar, Bundle bundle, com.github.domain.users.a aVar, r rVar) {
        this.d = aVar;
        this.e = rVar;
        this.a = dVar.n1();
        this.b = dVar.m3();
        this.c = bundle;
    }

    public final k1 a(Class cls) {
        k71.k.g(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        s0 s0Var = this.b;
        if (s0Var == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        x1 x1Var = this.a;
        k71.k.d(x1Var);
        k71.k.d(s0Var);
        b1 c = d1.c(x1Var, s0Var, canonicalName, this.c);
        za e = e(canonicalName, cls, c.s);
        e.K("androidx.lifecycle.savedstate.vm.tag", c);
        return e;
    }

    public final k1 c(Class cls, t6.c cVar) {
        k71.k.g(cls, "modelClass");
        k71.k.g(cVar, "extras");
        String str = (String) cVar.a(s1.b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        x1 x1Var = this.a;
        if (x1Var == null) {
            return e(str, cls, d1.d(cVar));
        }
        k71.k.d(x1Var);
        s0 s0Var = this.b;
        k71.k.d(s0Var);
        b1 c = d1.c(x1Var, s0Var, str, this.c);
        za e = e(str, cls, c.s);
        e.K("androidx.lifecycle.savedstate.vm.tag", c);
        return e;
    }

    public final void d(k1 k1Var) {
        x1 x1Var = this.a;
        if (x1Var != null) {
            s0 s0Var = this.b;
            k71.k.d(s0Var);
            d1.b(k1Var, x1Var, s0Var);
        }
    }

    public final za e(String str, Class cls, a1 a1Var) {
        k71.k.g(cls, "modelClass");
        UserViewType$Followers userViewType$Followers = UserViewType$Followers.INSTANCE;
        com.github.domain.users.a aVar = this.d;
        boolean b = k71.k.b(aVar, userViewType$Followers);
        r rVar = this.e;
        if (b) {
            return new v0(rVar.b, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$Following.INSTANCE)) {
            return new w0(rVar.c, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$Stargazers.INSTANCE)) {
            return new x7(rVar.f, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$Watchers.INSTANCE)) {
            return new fb(rVar.g, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$Sponsoring.INSTANCE)) {
            return new w7(rVar.e, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$Contributors.INSTANCE)) {
            return new com.github.rudroid.viewmodels.m(rVar.d, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$ReleaseMentions.INSTANCE)) {
            return new s6(rVar.h, rVar.a, a1Var);
        }
        if (k71.k.b(aVar, UserViewType$Reactees.INSTANCE)) {
            return new r6(rVar.i, rVar.a, a1Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
