from fastapi import FastAPI, File, UploadFile
import pytesseract
from PIL import Image
import io 

app = FastAPI()

@app.post("/ocr")
async def extract_text(file: UploadFile = File("sample_bill.png")):
    image = Image.open(io.BytesIO(await file.read()))
    text = pytesseract.image_to_string(image)
    return {"text":text}

