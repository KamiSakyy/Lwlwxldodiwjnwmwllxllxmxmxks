package com.github.rudroid.starredreposandlists.createoreditlist;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;

@c71.e(c = "com.github.rudroid.starredreposandlists.createoreditlist.EditListFragment$onViewCreated$1", f = "EditListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ EditListFragment w;
    public final /* synthetic */ View x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(EditListFragment editListFragment, View view, a71.c cVar) {
        super(2, cVar);
        this.w = editListFragment;
        this.x = view;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        k0 k0Var = new k0(this.w, this.x, cVar);
        k0Var.v = obj;
        return k0Var;
    }

    public final Object s(Object obj, Object obj2) {
        k0 r = r((a71.c) obj2, (xz0.h) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        androidx.lifecycle.a1 a;
        Parcelable parcelable = (xz0.h) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        boolean a2 = RuntimeFeatureFlag.a(cVar);
        final EditListFragment editListFragment = this.w;
        if (a2) {
            x6.k d = sy.s.i(editListFragment).d();
            if (d != null && (a = d.a()) != null) {
                a.c(parcelable, "EXTRA_USER_LIST_METADATA");
            }
        } else {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_USER_LIST_METADATA", parcelable);
            editListFragment.g4().setResult(-1, intent);
        }
        View view = this.x;
        if (view != null) {
            view.post(new Runnable() { // from class: com.github.rudroid.starredreposandlists.createoreditlist.j0
                @Override // java.lang.Runnable
                public final void run() {
                    d.y m;
                    k.i w3 = EditListFragment.this.w3();
                    if (w3 == null || (m = w3.m()) == null) {
                        return;
                    }
                    m.c();
                }
            });
        }
        return w61.a0.a;
    }
}
