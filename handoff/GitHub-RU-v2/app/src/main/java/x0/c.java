package x0;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.textclassifier.TextClassification;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f33655r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f33656s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f33657t;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f33655r = i;
        this.f33656s = obj;
        this.f33657t = obj2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f33655r) {
            case k5.f.J:
                ((v0.d) this.f33656s).f32327d.k(((d) this.f33657t).f33658a);
                break;
            default:
                Context context = (Context) this.f33656s;
                TextClassification textClassification = (TextClassification) this.f33657t;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT < 34) {
                    activity.send();
                    break;
                } else {
                    l.a(activity);
                    break;
                }
        }
        return true;
    }
}
