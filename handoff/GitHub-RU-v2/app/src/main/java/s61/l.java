package s61;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends AsyncTask {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public Exception d;

    public l(SubsamplingScaleImageView subsamplingScaleImageView, t61.c cVar, k kVar) {
        this.a = new WeakReference(subsamplingScaleImageView);
        this.b = new WeakReference(cVar);
        this.c = new WeakReference(kVar);
        kVar.d = true;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
            t61.c cVar = (t61.c) this.b.get();
            k kVar = (k) this.c.get();
            if (cVar != null && kVar != null && subsamplingScaleImageView != null) {
                ReentrantReadWriteLock reentrantReadWriteLock = subsamplingScaleImageView.h0;
                if (cVar.a() && kVar.e) {
                    reentrantReadWriteLock.readLock().lock();
                    try {
                        if (!cVar.a()) {
                            kVar.d = false;
                            reentrantReadWriteLock.readLock().unlock();
                            return null;
                        }
                        SubsamplingScaleImageView.e(subsamplingScaleImageView, kVar.a, kVar.g);
                        Bitmap d = cVar.d(kVar.b, kVar.g);
                        reentrantReadWriteLock.readLock().unlock();
                        return d;
                    } catch (Throwable th) {
                        subsamplingScaleImageView.h0.readLock().unlock();
                        throw th;
                    }
                }
            }
            if (kVar == null) {
                return null;
            }
            kVar.d = false;
            return null;
        } catch (Exception e) {
            List list = n.a;
            this.d = e;
            return null;
        } catch (OutOfMemoryError e2) {
            List list2 = n.a;
            this.d = new RuntimeException(e2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) obj;
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) this.a.get();
        k kVar = (k) this.c.get();
        if (subsamplingScaleImageView == null || kVar == null) {
            return;
        }
        if (bitmap2 == null) {
            if (this.d != null) {
                Bitmap.Config config = SubsamplingScaleImageView.F0;
                return;
            }
            return;
        }
        kVar.c = bitmap2;
        kVar.d = false;
        Bitmap.Config config2 = SubsamplingScaleImageView.F0;
        synchronized (subsamplingScaleImageView) {
            try {
                subsamplingScaleImageView.h();
                subsamplingScaleImageView.g();
                if (subsamplingScaleImageView.o() && (bitmap = subsamplingScaleImageView.r) != null) {
                    bitmap.recycle();
                    subsamplingScaleImageView.r = null;
                    subsamplingScaleImageView.s = false;
                }
                subsamplingScaleImageView.invalidate();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
