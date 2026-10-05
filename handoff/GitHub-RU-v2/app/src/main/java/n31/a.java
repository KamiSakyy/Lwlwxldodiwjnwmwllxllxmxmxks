package n31;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;
import u31.j;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ ShapeableImageView b;

    public a(ShapeableImageView shapeableImageView) {
        this.b = shapeableImageView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.b;
        if (shapeableImageView.C == null) {
            return;
        }
        if (shapeableImageView.B == null) {
            shapeableImageView.B = new j(shapeableImageView.C);
        }
        RectF rectF = shapeableImageView.v;
        Rect rect = this.a;
        rectF.round(rect);
        shapeableImageView.B.setBounds(rect);
        shapeableImageView.B.getOutline(outline);
    }
}
