package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import j.a;

/* loaded from: /home/user/work/p/classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: r, reason: collision with root package name */
    public int f898r;

    /* renamed from: s, reason: collision with root package name */
    public int f899s;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f26266t);
        this.f899s = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f898r = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
