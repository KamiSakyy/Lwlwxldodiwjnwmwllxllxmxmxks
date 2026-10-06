package e7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import l7.n1;

/* loaded from: /home/user/work/p/classes.dex */
public final class v extends n1 {

    /* renamed from: u, reason: collision with root package name */
    public Drawable f22037u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f22038v;

    /* renamed from: w, reason: collision with root package name */
    public SparseArray f22039w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22040x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22041y;

    public v(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f22039w = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(2131362903, view.findViewById(2131362903));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f22037u = view.getBackground();
        if (textView != null) {
            this.f22038v = textView.getTextColors();
        }
    }

    public final View y(int i) {
        SparseArray sparseArray = this.f22039w;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.f28209a.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
