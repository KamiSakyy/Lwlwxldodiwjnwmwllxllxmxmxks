package s61;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import es.voghdev.pdfviewpager.library.subscaleview.decoder.SkiaImageDecoder;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends AsyncTask {
    public WeakReference a;
    public WeakReference b;
    public WeakReference c;
    public Uri d;
    public boolean e;
    public Bitmap f;
    public Exception g;

    public i(SubsamplingScaleImageView subsamplingScaleImageView, Context context, t61.b bVar, Uri uri, boolean z) {
        this.a = new WeakReference(subsamplingScaleImageView);
        this.b = new WeakReference(context);
        this.c = new WeakReference(bVar);
        this.d = uri;
        this.e = z;
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
            this.f = ((SkiaImageDecoder) ((t61.a) bVar).a.newInstance()).a(context, uri);
            return Integer.valueOf(SubsamplingScaleImageView.d(subsamplingScaleImageView, context, uri2));
        } catch (Exception e) {
            List list = n.a;
            this.g = e;
            return null;
        } catch (OutOfMemoryError e2) {
            List list2 = n.a;
            this.g = new RuntimeException(e2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
        if (subsamplingScaleImageView != null) {
            Bitmap bitmap = this.f;
            if (bitmap == null || num == null) {
                if (this.g != null) {
                    Bitmap.Config config = SubsamplingScaleImageView.F0;
                    return;
                }
                return;
            }
            if (!this.e) {
                int intValue = num.intValue();
                Bitmap.Config config2 = SubsamplingScaleImageView.F0;
                subsamplingScaleImageView.q(bitmap, intValue);
                return;
            }
            Bitmap.Config config3 = SubsamplingScaleImageView.F0;
            synchronized (subsamplingScaleImageView) {
                if (subsamplingScaleImageView.r == null && !subsamplingScaleImageView.u0) {
                    subsamplingScaleImageView.r = bitmap;
                    subsamplingScaleImageView.s = true;
                    if (subsamplingScaleImageView.h()) {
                        subsamplingScaleImageView.invalidate();
                        subsamplingScaleImageView.requestLayout();
                    }
                    return;
                }
                bitmap.recycle();
            }
        }
    }
}
