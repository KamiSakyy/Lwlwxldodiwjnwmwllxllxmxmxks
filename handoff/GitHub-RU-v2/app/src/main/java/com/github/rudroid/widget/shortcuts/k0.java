package com.github.rudroid.widget.shortcuts;

import android.content.Context;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity;
import com.google.android.gms.internal.measurement.z3;
import y71.y1;

@c71.e(c = "com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity$savePrefAndUpdateWidget$1", f = "ShortcutWidgetSettingsActivity.kt", l = {346, 347}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ ShortcutWidgetSettingsActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ShortcutWidgetSettingsActivity shortcutWidgetSettingsActivity, a71.c cVar) {
        super(2, cVar);
        this.w = shortcutWidgetSettingsActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r14 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r14 == r0) goto L26;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object obj2;
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        ?? r3 = this.w;
        if (i == 0) {
            sy.y.j(obj);
            ShortcutWidgetSettingsActivity.a aVar2 = ShortcutWidgetSettingsActivity.Companion;
            com.github.rudroid.widget.shortcuts.viewmodel.f s0 = r3.s0();
            this.v = 1;
            y1 y1Var = s0.y;
            oa.j jVar = ((com.github.rudroid.widget.shortcuts.viewmodel.b) y1Var.getValue()).b;
            StoredShortcutModel storedShortcutModel = ((com.github.rudroid.widget.shortcuts.viewmodel.b) s0.z.getValue()).d;
            float f = ((com.github.rudroid.widget.shortcuts.viewmodel.b) y1Var.getValue()).f;
            z5.k kVar = s0.x;
            if (kVar != null && jVar != null && storedShortcutModel != null) {
                g gVar = s0.t;
                obj2 = z3.n(gVar.a, new p(gVar, kVar, jVar, storedShortcutModel.r, f, null), this);
                if (obj2 != aVar) {
                    obj2 = a0Var;
                }
            }
            obj2 = a0Var;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return a0Var;
            }
            sy.y.j(obj);
        }
        f fVar = new f();
        this.v = 2;
        return v8.l0.S(fVar, (Context) r3, this) == aVar ? aVar : a0Var;
    }
}
