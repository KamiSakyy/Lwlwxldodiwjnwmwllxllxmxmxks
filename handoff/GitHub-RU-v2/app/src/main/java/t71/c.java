package t71;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements s71.h {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f32115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32116b;

    /* renamed from: c, reason: collision with root package name */
    public final j71.e f32117c;

    public c(CharSequence charSequence, int i, j71.e eVar) {
        k71.k.g(charSequence, "input");
        this.f32115a = charSequence;
        this.f32116b = i;
        this.f32117c = eVar;
    }

    @Override // s71.h
    public final Iterator iterator() {
        return new b(this);
    }
}
