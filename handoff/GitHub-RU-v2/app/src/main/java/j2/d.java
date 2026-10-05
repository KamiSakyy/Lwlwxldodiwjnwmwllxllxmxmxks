package j2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f26785a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26786b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26787c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26788d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26789e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26790f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26791g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26792h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f26793j;

    public d(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f6 = (i & 2) != 0 ? 0.0f : f6;
        f10 = (i & 4) != 0 ? 0.0f : f10;
        f11 = (i & 8) != 0 ? 0.0f : f11;
        f12 = (i & 16) != 0 ? 1.0f : f12;
        f13 = (i & 32) != 0 ? 1.0f : f13;
        f14 = (i & 64) != 0 ? 0.0f : f14;
        f15 = (i & 128) != 0 ? 0.0f : f15;
        if ((i & 256) != 0) {
            int i10 = m0.f26904a;
            list = x61.r.r;
        }
        ArrayList arrayList = new ArrayList();
        this.f26785a = str;
        this.f26786b = f6;
        this.f26787c = f10;
        this.f26788d = f11;
        this.f26789e = f12;
        this.f26790f = f13;
        this.f26791g = f14;
        this.f26792h = f15;
        this.i = list;
        this.f26793j = arrayList;
    }
}
