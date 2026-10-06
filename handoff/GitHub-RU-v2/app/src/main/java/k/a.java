package k;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends ArrayAdapter {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f27398r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f27399s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f27399s = dVar;
        this.f27398r = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f27399s.f27426r;
        if (zArr != null && zArr[i]) {
            this.f27398r.setItemChecked(i, true);
        }
        return view2;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class AlertController$RecycleListView {
        public AlertController$RecycleListView() {
        }
    }
}
