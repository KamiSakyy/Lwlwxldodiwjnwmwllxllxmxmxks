package q31;

import android.R;
import android.content.res.ColorStateList;
import q.z;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends z {
    public static final int[][] x = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList v;
    public boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.v == null) {
            int n = a.a.n(this, 2130968853);
            int n2 = a.a.n(this, 2130968873);
            int n3 = a.a.n(this, 2130968896);
            this.v = new ColorStateList(x, new int[]{a.a.q(n3, 1.0f, n), a.a.q(n3, 0.54f, n2), a.a.q(n3, 0.38f, n2), a.a.q(n3, 0.38f, n2)});
        }
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (this.w && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setUseMaterialThemeColors(boolean z) {
        this.w = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
    public Object getContext() { return null; }
    public Object setButtonTintList(Object) { return null; }
}
