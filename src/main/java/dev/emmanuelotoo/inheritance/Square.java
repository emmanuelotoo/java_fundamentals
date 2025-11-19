package dev.emmanuelotoo.inheritance;

import dev.emmanuelotoo.objects.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
}
