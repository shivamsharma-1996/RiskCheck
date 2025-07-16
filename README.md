# RiskCheck

Scan food and cosmetic ingredients with your camera and get instant hazard/risk analysis.

## Overview
RiskCheck uses Firebase ML Kit for text recognition and an LLM API(s) to analyze ingredients and provide a risk level (no, low, medium, high, extreme) for each item.

> _Disclaimer: This app is for informational purposes only and does not replace professional advice._

## Features
- 📷 Scan ingredients from product labels
- 🤖 AI-powered risk assessment
- 🛡️ Supports food and cosmetic products
- 🔥 Built with Kotlin, Firebase ML Kit, and LLM APIs

## How It Works
1. Use your camera to scan the ingredients list on a product.
2. The app uses Firebase ML Kit to extract text from the image.
3. The extracted ingredients are sent to an LLM API (OpenAI or Gemini).
4. The LLM analyzes the ingredients and returns a risk level for each.

## Tech Stack
- **Kotlin** (Android)
- **Firebase ML Kit** (Text Recognition)
- **OpenAI or Gemini LLM API** (Ingredient Analysis)

## License
This project is licensed under the MIT License. See [LICENSE](LICENSE) for details. 
