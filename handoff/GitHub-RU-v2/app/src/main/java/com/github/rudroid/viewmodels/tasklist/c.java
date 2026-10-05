package com.github.rudroid.viewmodels.tasklist;

import java.util.LinkedHashMap;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ n s;
    public final /* synthetic */ String t;

    public /* synthetic */ c(n nVar, String str, int i) {
        this.r = i;
        this.s = nVar;
        this.t = str;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.r) {
            case 0:
                n nVar = this.s;
                LinkedHashMap linkedHashMap = nVar.z;
                String str = this.t;
                linkedHashMap.remove(str);
                y1 y1Var = nVar.y;
                fl.e eVar = fl.f.Companion;
                b bVar2 = new b(null, str);
                eVar.getClass();
                fl.f a = fl.e.a(bVar, bVar2);
                y1Var.getClass();
                y1Var.k((Object) null, a);
                break;
            case 1:
                n nVar2 = this.s;
                LinkedHashMap linkedHashMap2 = nVar2.z;
                String str2 = this.t;
                linkedHashMap2.remove(str2);
                y1 y1Var2 = nVar2.y;
                fl.e eVar2 = fl.f.Companion;
                b bVar3 = new b(null, str2);
                eVar2.getClass();
                fl.f a2 = fl.e.a(bVar, bVar3);
                y1Var2.getClass();
                y1Var2.k((Object) null, a2);
                break;
            case 2:
                n nVar3 = this.s;
                LinkedHashMap linkedHashMap3 = nVar3.z;
                String str3 = this.t;
                linkedHashMap3.remove(str3);
                y1 y1Var3 = nVar3.y;
                fl.e eVar3 = fl.f.Companion;
                b bVar4 = new b(null, str3);
                eVar3.getClass();
                fl.f a3 = fl.e.a(bVar, bVar4);
                y1Var3.getClass();
                y1Var3.k((Object) null, a3);
                break;
            case 3:
                n nVar4 = this.s;
                LinkedHashMap linkedHashMap4 = nVar4.z;
                String str4 = this.t;
                linkedHashMap4.remove(str4);
                y1 y1Var4 = nVar4.y;
                fl.e eVar4 = fl.f.Companion;
                b bVar5 = new b(null, str4);
                eVar4.getClass();
                fl.f a4 = fl.e.a(bVar, bVar5);
                y1Var4.getClass();
                y1Var4.k((Object) null, a4);
                break;
            default:
                n nVar5 = this.s;
                LinkedHashMap linkedHashMap5 = nVar5.z;
                String str5 = this.t;
                linkedHashMap5.remove(str5);
                y1 y1Var5 = nVar5.y;
                fl.e eVar5 = fl.f.Companion;
                b bVar6 = new b(null, str5);
                eVar5.getClass();
                fl.f a5 = fl.e.a(bVar, bVar6);
                y1Var5.getClass();
                y1Var5.k((Object) null, a5);
                break;
        }
        return a0.a;
    }
}
