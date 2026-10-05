package b6;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class n1 {

    /* renamed from: e, reason: collision with root package name */
    public static final n1 f3642e = new n1(new long[0], new RemoteViews[0], false, 1);

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3643a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteViews[] f3644b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3645c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3646d;

    public n1(long[] jArr, RemoteViews[] remoteViewsArr, boolean z10, int i) {
        this.f3643a = jArr;
        this.f3644b = remoteViewsArr;
        this.f3645c = z10;
        this.f3646d = i;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = x61.m.F0(x61.m.J0(arrayList)).size();
        if (size <= this.f3646d) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f3646d + ", but the collection contains " + size + " different layout ids").toString());
    }
}
