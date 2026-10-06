import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';

// base './' ОБЯЗАТЕЛЕН: приложение открывается из assets через file://,
// все пути к чанкам должны быть относительными (иначе белый экран офлайн).
export default defineConfig({
  base: './',
  plugins: [vue()],
  build: {
    outDir: 'dist',
    assetsDir: 'assets',
    target: ['es2020', 'chrome80'],
    cssMinify: true,
    reportCompressedSize: false,
    chunkSizeWarningLimit: 2000,
    rollupOptions: {
      output: {
        manualChunks: undefined,
        entryFileNames: 'assets/app-[hash].js',
        chunkFileNames: 'assets/chunk-[hash].js',
        assetFileNames: 'assets/[name]-[hash][extname]',
      },
    },
  },
});
