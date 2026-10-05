package com.github.rudroid.actions.repositoryworkflows;

import com.github.rudroid.utilities.ui.g1;
import java.util.ArrayList;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class o implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5163r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f5164s;

    public /* synthetic */ o(u uVar, int i) {
        this.f5163r = i;
        this.f5164s = uVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f5163r) {
            case k5.f.J:
                u uVar = this.f5164s;
                y1 y1Var = uVar.f5180y;
                fl.b b10 = fl.a.b(fl.b.Companion, bVar, uVar.f5178w);
                mn.x xVar = (mn.x) ((g1) y1Var.getValue()).getData();
                ArrayList arrayList = xVar != null ? xVar.a : null;
                uVar.P(y1Var, b10, arrayList == null || arrayList.isEmpty());
                break;
            default:
                u uVar2 = this.f5164s;
                y1 y1Var2 = uVar2.f5180y;
                fl.b b11 = fl.a.b(fl.b.Companion, bVar, uVar2.f5178w);
                mn.x xVar2 = (mn.x) ((g1) y1Var2.getValue()).getData();
                ArrayList arrayList2 = xVar2 != null ? xVar2.a : null;
                uVar2.P(y1Var2, b11, arrayList2 == null || arrayList2.isEmpty());
                break;
        }
        return a0.a;
    }
}
