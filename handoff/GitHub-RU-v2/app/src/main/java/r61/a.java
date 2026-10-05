package r61;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.k;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import f1.y3;
import java.io.File;
import java.net.URI;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends androidx.viewpager.widget.a {
    public Context b;
    public PdfRenderer c;
    public y3 d;
    public LayoutInflater e;
    public float f;
    public int g;
    public u61.a h;

    public final void a(int i, Object obj) {
    }

    public final int c() {
        PdfRenderer pdfRenderer = this.c;
        if (pdfRenderer != null) {
            return pdfRenderer.getPageCount();
        }
        return 0;
    }

    public final Object e(k kVar, int i) {
        View inflate = this.e.inflate(2131559961, (ViewGroup) kVar, false);
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) inflate.findViewById(2131363370);
        if (this.c == null || c() < i) {
            return inflate;
        }
        PdfRenderer.Page openPage = this.c.openPage(i);
        y3 y3Var = this.d;
        int i2 = i % y3Var.r;
        Bitmap[] bitmapArr = (Bitmap[]) y3Var.u;
        if (bitmapArr[i2] == null) {
            bitmapArr[i2] = Bitmap.createBitmap(y3Var.s, y3Var.t, (Bitmap.Config) y3Var.v);
        }
        bitmapArr[i2].eraseColor(0);
        Bitmap bitmap = bitmapArr[i2];
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        subsamplingScaleImageView.setImage(new s61.a(bitmap));
        subsamplingScaleImageView.setOnClickListener(new com.google.android.material.datepicker.k(6, this));
        openPage.render(bitmap, null, null, 1);
        openPage.close();
        kVar.addView(inflate, 0);
        return inflate;
    }

    public final boolean f(View view, Object obj) {
        return view == ((View) obj);
    }

    public final ParcelFileDescriptor k(String str) {
        Context context = this.b;
        File file = new File(str);
        if (file.exists()) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        if (!str.startsWith("/")) {
            return ParcelFileDescriptor.open(new File(context.getCacheDir(), str), 268435456);
        }
        return context.getContentResolver().openFileDescriptor(Uri.parse(URI.create("file://".concat(str)).toString()), "rw");
    }
}
