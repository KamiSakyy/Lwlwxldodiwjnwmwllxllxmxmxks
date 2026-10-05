package i3;

import android.text.SegmentFinder;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e51.a f25770a;

    public a(e51.a aVar) {
        this.f25770a = aVar;
    }

    public final int nextEndBoundary(int i) {
        return this.f25770a.w(i);
    }

    public final int nextStartBoundary(int i) {
        return this.f25770a.l(i);
    }

    public final int previousEndBoundary(int i) {
        return this.f25770a.m(i);
    }

    public final int previousStartBoundary(int i) {
        return this.f25770a.v(i);
    }
}
