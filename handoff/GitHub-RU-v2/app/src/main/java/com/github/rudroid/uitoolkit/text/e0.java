package com.github.rudroid.uitoolkit.text;

@c71.e(c = "com.github.rudroid.uitoolkit.text.PrimaryTextFieldKt$PrimaryPaddedTextField$3$1$1", f = "PrimaryTextField.kt", l = {242}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ p0.c w;
    public final /* synthetic */ c2.c x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p0.c cVar, c2.c cVar2, float f, a71.c cVar3) {
        super(2, cVar3);
        this.w = cVar;
        this.x = cVar2;
        this.y = f;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            c2.c i2 = this.x.i(0.0f, this.y);
            this.v = 1;
            if (this.w.a(i2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
