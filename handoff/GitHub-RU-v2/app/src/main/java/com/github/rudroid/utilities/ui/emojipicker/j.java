package com.github.rudroid.utilities.ui.emojipicker;

import com.github.rudroid.y;
import n0.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.utilities.ui.emojipicker.EmojiPickerKt$EmojiPicker$1$2$1$1$1$1$1$1", f = "EmojiPicker.kt", l = {106}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ z w;
    public final /* synthetic */ y x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, y yVar, a71.c cVar) {
        super(2, cVar);
        this.w = zVar;
        this.x = yVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            q71.g gVar = (q71.g) b.b.get(this.x);
            int i2 = gVar != null ? ((q71.e) gVar).r : 0;
            this.v = 1;
            if (z.i(this.w, i2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return a0.a;
    }
}
