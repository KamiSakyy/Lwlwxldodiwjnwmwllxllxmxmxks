package com.github.rudroid.users;

import com.github.rudroid.main.MainActivity;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.users.UsersFragment$onCreateView$1$1$2$1", f = "UsersFragment.kt", l = {102}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m0.s w;
    public final /* synthetic */ UsersFragment x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m0.s sVar, UsersFragment usersFragment, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
        this.x = usersFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        a0 a0Var = a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
            return a0Var;
        }
        y.j(obj);
        UsersFragment usersFragment = this.x;
        g gVar = new g(usersFragment, 2);
        MainActivity g4 = usersFragment.g4();
        MainActivity mainActivity = g4 instanceof MainActivity ? g4 : null;
        if (mainActivity != null) {
            this.v = 1;
            if (com.github.rudroid.interfaces.c.a(this.w, gVar, mainActivity, this) == aVar) {
                return aVar;
            }
        }
        return a0Var;
    }
}
