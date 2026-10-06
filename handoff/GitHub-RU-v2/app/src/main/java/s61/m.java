package s61;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m extends AsyncTask {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public final Uri d;
    public t61.c e;
    public Exception f;

    public m(SubsamplingScaleImageView subsamplingScaleImageView, Context context, t61.b bVar, Uri uri) {
        this.a = new WeakReference(subsamplingScaleImageView);
        this.b = new WeakReference(context);
        this.c = new WeakReference(bVar);
        this.d = uri;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri = this.d;
        try {
            String uri2 = uri.toString();
            Context context = (Context) this.b.get();
            t61.b bVar = (t61.b) this.c.get();
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
            if (context == null || bVar == null || subsamplingScaleImageView == null) {
                return null;
            }
            t61.c cVar = (t61.c) ((t61.a) bVar).a.newInstance();
            this.e = cVar;
            Point c = cVar.c(context, uri);
            return new int[]{c.x, c.y, SubsamplingScaleImageView.d(subsamplingScaleImageView, context, uri2)};
        } catch (Exception e) {
            List list = n.a;
            this.f = e;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i;
        int i2;
        int i3;
        int[] iArr = (int[]) obj;
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
        if (subsamplingScaleImageView != null) {
            t61.c cVar = this.e;
            if (cVar == null || iArr == null || iArr.length != 3) {
                if (this.f != null) {
                    Bitmap.Config config = SubsamplingScaleImageView.F0;
                    return;
                }
                return;
            }
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            Bitmap.Config config2 = SubsamplingScaleImageView.F0;
            synchronized (subsamplingScaleImageView) {
                try {
                    int i7 = subsamplingScaleImageView.U;
                    if (i7 > 0 && (i3 = subsamplingScaleImageView.V) > 0 && (i7 != i4 || i3 != i5)) {
                        subsamplingScaleImageView.t(false);
                        Bitmap bitmap = subsamplingScaleImageView.r;
                        if (bitmap != null) {
                            bitmap.recycle();
                            subsamplingScaleImageView.r = null;
                            subsamplingScaleImageView.s = false;
                        }
                    }
                    subsamplingScaleImageView.g0 = cVar;
                    subsamplingScaleImageView.U = i4;
                    subsamplingScaleImageView.V = i5;
                    subsamplingScaleImageView.W = i6;
                    subsamplingScaleImageView.h();
                    if (!subsamplingScaleImageView.g() && (i = subsamplingScaleImageView.C) > 0 && i != Integer.MAX_VALUE && (i2 = subsamplingScaleImageView.D) > 0 && i2 != Integer.MAX_VALUE && subsamplingScaleImageView.getWidth() > 0 && subsamplingScaleImageView.getHeight() > 0) {
                        subsamplingScaleImageView.m(new Point(subsamplingScaleImageView.C, subsamplingScaleImageView.D));
                    }
                    subsamplingScaleImageView.invalidate();
                    subsamplingScaleImageView.requestLayout();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
