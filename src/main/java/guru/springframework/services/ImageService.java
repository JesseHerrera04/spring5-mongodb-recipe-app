package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created on 8/4/2025 by Jesse H.
 * Package: Services; Class: ImageService
 * Interface for Image Service
 */
public interface ImageService {
    void saveImageFile(String recipeId, MultipartFile imageFileName);
}
