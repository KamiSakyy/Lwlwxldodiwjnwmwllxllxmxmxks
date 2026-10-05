package com.github.rudroid.utilities.ui.emojipicker;

import androidx.compose.runtime.f1;
import n0.z;
import sy.y;
import t00.f8;
import w61.a0;

@c71.e(c = "com.github.rudroid.utilities.ui.emojipicker.EmojiPickerKt$EmojiPicker$1$1$1", f = "EmojiPicker.kt", l = {82}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ z w;
    public final /* synthetic */ f1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z zVar, f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.w = zVar;
        this.x = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            f8 J = androidx.compose.runtime.t.J(new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(24, this.w));
            h hVar = new h(this.x);
            this.v = 1;
            if (J.b(hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z<T1,T2,T3,T4> {
        public z() {
        }
    }
}
