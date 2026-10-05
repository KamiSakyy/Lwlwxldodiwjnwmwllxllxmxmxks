package u9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import s9.h;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f32269a = a.class.getName();

    @Override // u9.d
    public final Bitmap a(Bitmap bitmap, h hVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f6 = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f6, f6, f6, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f6 - (bitmap.getWidth() / 2.0f), f6 - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    @Override // u9.d
    public final String b() {
        return this.f32269a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
