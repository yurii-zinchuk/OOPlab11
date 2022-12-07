package org.example.task3.image;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProxyImage implements MyImage{
    private String filepath;
    @Override
    public void display() {
        RealImage realImage = new RealImage(filepath);
        realImage.display();
    }
}
