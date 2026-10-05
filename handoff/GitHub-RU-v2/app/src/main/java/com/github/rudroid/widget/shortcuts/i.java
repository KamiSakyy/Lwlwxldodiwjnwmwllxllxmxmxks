package com.github.rudroid.widget.shortcuts;

import y71.n1;

@c71.e(c = "com.github.rudroid.widget.shortcuts.ShortcutPreferences", f = "ShortcutPreferences.kt", l = {123}, m = "getAccountName", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.c {
    public s5.e u;
    public /* synthetic */ Object v;
    public final /* synthetic */ g w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, c71.c cVar) {
        super(cVar);
        this.w = gVar;
    }

    public final Object v(Object obj) {
        i iVar;
        s5.e eVar;
        this.v = obj;
        int i = this.x | Integer.MIN_VALUE;
        this.x = i;
        int i2 = i & Integer.MIN_VALUE;
        g gVar = this.w;
        if (i2 != 0) {
            this.x = i - Integer.MIN_VALUE;
            iVar = this;
        } else {
            iVar = new i(gVar, this);
        }
        Object obj2 = iVar.v;
        b71.a aVar = b71.a.r;
        int i3 = iVar.x;
        if (i3 == 0) {
            sy.y.j(obj2);
            s5.e Q = b91.g.Q(g.c(null));
            y71.i data = gVar.a.getData();
            iVar.u = Q;
            iVar.x = 1;
            Object v = n1.v(data, iVar);
            if (v == aVar) {
                return aVar;
            }
            obj2 = v;
            eVar = Q;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = iVar.u;
            sy.y.j(obj2);
        }
        s5.b bVar = (s5.b) obj2;
        if (bVar != null) {
            return (String) bVar.d(eVar);
        }
        return null;
    }
}
