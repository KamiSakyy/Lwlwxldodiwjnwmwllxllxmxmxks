package androidx.compose.ui.layout;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class u implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f2073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j71.c f2074d;

    public u(int i, int i10, Map map, j71.c cVar) {
        this.f2071a = i;
        this.f2072b = i10;
        this.f2073c = map;
        this.f2074d = cVar;
    }

    @Override // androidx.compose.ui.layout.w0
    public final Map c() {
        return this.f2073c;
    }

    @Override // androidx.compose.ui.layout.w0
    public final void d() {
    }

    @Override // androidx.compose.ui.layout.w0
    public final int e() {
        return this.f2072b;
    }

    @Override // androidx.compose.ui.layout.w0
    public final int f() {
        return this.f2071a;
    }

    @Override // androidx.compose.ui.layout.w0
    public final j71.c g() {
        return this.f2074d;
    }
}
