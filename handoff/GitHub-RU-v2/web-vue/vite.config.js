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
    chunkSizeWarningLimit: 2000,
  },
});
