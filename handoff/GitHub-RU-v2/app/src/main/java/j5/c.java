package j5;

import android.graphics.Rect;
import b5.f;
import e50.z0;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f27217a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f27218b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27219c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f27220d;

    public c(boolean z10, z0 z0Var) {
        this.f27219c = z10;
        this.f27220d = z0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f27220d.getClass();
        Rect rect = this.f27217a;
        ((f) obj).f(rect);
        Rect rect2 = this.f27218b;
        ((f) obj2).f(rect2);
        int i = rect.top;
        int i10 = rect2.top;
        if (i < i10) {
            return -1;
        }
        if (i > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z10 = this.f27219c;
        if (i11 < i12) {
            return z10 ? 1 : -1;
        }
        if (i11 > i12) {
            return z10 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z10 ? 1 : -1;
        }
        if (i15 > i16) {
            return z10 ? -1 : 1;
        }
        return 0;
    }
}
