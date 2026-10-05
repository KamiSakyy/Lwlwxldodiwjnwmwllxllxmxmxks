package com.github.rudroid.utilities;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public static final boolean a(Context context) {
        k71.k.g(context, "<this>");
        return (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f || Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f) == 0.0f || Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f) == 0.0f) ? false : true;
    }

    public static final BitmapDrawable b(Context context) {
        Bitmap d = d(e(2131231508, 2131099749, context));
        Resources resources = context.getResources();
        k71.k.f(resources, "getResources(...)");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, d);
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        return bitmapDrawable;
    }

    public static final BitmapDrawable c(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            Bitmap d = d(drawable);
            Resources resources = context.getResources();
            k71.k.f(resources, "getResources(...)");
            return new BitmapDrawable(resources, d);
        }
        throw new IllegalStateException(("Drawable " + i + " does not exist").toString());
    }

    public static final Bitmap d(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final Drawable e(int i, int i2, Context context) {
        Drawable mutate;
        k71.k.g(context, "<this>");
        Drawable drawable = context.getDrawable(i);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setTint(context.getColor(i2));
            return mutate;
        }
        throw new IllegalStateException(("Drawable " + i + " does not exist").toString());
    }
}
