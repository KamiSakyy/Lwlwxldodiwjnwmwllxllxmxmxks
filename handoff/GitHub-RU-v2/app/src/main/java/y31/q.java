package y31;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends ArrayAdapter {
    public ColorStateList r;
    public ColorStateList s;
    public final /* synthetic */ r t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.t = rVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        r rVar = this.t;
        ColorStateList colorStateList2 = rVar.C;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.s = colorStateList;
        if (rVar.B != 0 && rVar.C != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{r4.a.d(rVar.C.getColorForState(iArr3, 0), rVar.B), r4.a.d(rVar.C.getColorForState(iArr2, 0), rVar.B), rVar.B});
        }
        this.r = colorStateList3;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.EditText, y31.r] */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            r r6 = this.t;
            Drawable drawable = null;
            if (r6.getText().toString().contentEquals(textView.getText()) && r6.B != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(r6.B);
                if (this.s != null) {
                    colorDrawable.setTintList(this.r);
                    drawable = new RippleDrawable(this.s, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class n {
        public n() {
        }
    }
}
