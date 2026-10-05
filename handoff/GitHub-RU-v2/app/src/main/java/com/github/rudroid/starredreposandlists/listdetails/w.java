package com.github.rudroid.starredreposandlists.listdetails;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ic.i4;
import ic.wd;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class w extends k71.i implements j71.f {
    public static final w z = new w(3, wd.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/github/rudroid/databinding/ListItemRepositoryBinding;", 0);

    public final Object f(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        k71.k.g(layoutInflater, "p0");
        int i = wd.a0;
        i4 i4Var = k5.b.b;
        if (i4Var == null) {
            i4Var = null;
        }
        return k5.b.b(layoutInflater, 2131559245, viewGroup, booleanValue, i4Var);
    }
}
